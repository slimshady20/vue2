// import axios from 'axios'

const state = {
        userid:'',
        passwd: '',

}
const actions={
    login({commit}){
        commit('login')
    },
    join({commit}){
        commit('join')
    }
}


const mutations={

}
const getters={

}
export default {
    name: 'player',
    namespaced: true,
    state,
    actions,
    mutations,
    getters
}
