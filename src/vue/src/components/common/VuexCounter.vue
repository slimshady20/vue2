<template>
    <div>
    카운터: {{count}}<br>
    <button @click = "increment">+</button><br>
    <button @click = "decrement">-</button>
        <button @click ="incrementIfOdd">Increment If Odd</button>
        <button @click ="incrementAsync">Increment Async</button>
        <div>
            <div>최근 5개 값의 로그: {{recentHistory}}</div>
        </div>
    </div>

</template>

<script>
    import {mapGetters, mapActions} from 'vuex'
    export default {
        computed: mapGetters([ //자동
           'count',
            'recentHistory'
        ]),
        methods: mapActions([  // 수동으로선택
            'increment',
            'decrement',
            'incrementIfOdd',
            'incrementAsync'
        ])
    }
</script>

<style scoped>

</style>