// First we need to import axios.js
import axios from "axios";
// Next we make an 'instance' of it
axios.defaults.headers.post["Content-Type"] = "application/json";
// instance.defaults.headers.common['Authorization'] = 'AUTH TOKEN FROM INSTANCE';

// Also add/ configure interceptors && all the other cool stuff

export default axios;
