import { API_URL } from "../conf/web.config";

// string Empty 체크
export const isEmpty = (value) => {
    // console.log(value + " - " + typeof value);
  
    const obj = String(value);
  
    if (obj == null || obj == undefined || obj == 'null' || obj == 'undefined' || obj == '' || obj == 'NaN') {
      return true;
    } else {
      return false;
    }
  }

  // random int 가져오기
  export const getRandomInt = (min, max) => {
      min = Math.ceil(min);
      max = Math.floor(max);

      return Math.floor(Math.random() * (max-min)) + min;
  }

  // 특정 html dom 노드의 하위 노드 제거
  export const removeAllChildNodes = (parent) => {
      while(parent.firstChild) {
          parent.removeChild(parent.firstChild);
      }
  }

  // API URL 가져오는 function
  export const getApiUrl = (apiBaseUrlKey, apiName) => {
    return API_URL[apiName]
  }