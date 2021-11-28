const chartDataStore = {
    namespaced: true,

    state: {
        barChartData: [],
        basicColumnData: [],
        stockChartData: [],
        topologyNodes: []
    },

    getters: {
        getBarChartData: function(state) {
            return state.barChartData
        },
        getBasicColumnData: function(state) {
            return state.basicColumnData
        },
        getStockChartData: function(state) {
            return state.stockChartData
        },
        getTopologyNodes: function(state) {
            return state.topologyNodes
        },
    },

    mutations: {
        setBarChartData: function(state, payload) {
            return state.barChartData = payload
        },
        setBasicColumnData: function(state, payload) {
            return state.basicColumnData = payload
        },

        setStockChartData: function(state, payload) {
            return state.stockChartData = payload
        },

        setTopologyNodes: function(state, payload) {
            return state.topologyNodes = payload
        },
    },

    actions: {
        setBarChartData: function(context, payload) {
            return context.commit('setBarChartData', payload)
        },
        setBasicColumnData: function(context, payload) {
            return context.commit('setBasicColumnData', payload)
        },

        setStockChartData: function(context, payload) {
            return context.commit('setStockChartData', payload)
        },

        setTopologyNodes: function(context, payload) {
            return context.commit('setTopologyNodes', payload)
        },
    }
}

export default chartDataStore;