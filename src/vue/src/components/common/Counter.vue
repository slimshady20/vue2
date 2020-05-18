<template>
    <div>
    <div class="display">{{ count }}</div>
          <div @click="counter" class="btn operator">클릭수 올리기</div>
        <div @click="clear" class="btn">초기화</div>
    </div>
</template>

<script>
    export default {
        data () {
            return {
                count: 0
            }
    },
    methods: {
            counter () {
                this.count++

            },
            clear(){
                this.count=0
            }

        }
    }
</script>

<style scoped>
    .display {
        grid-column: 1 / 5;
        background-color: #333;
        color: white;

    }
    .btn {
        background-color: #F2F2F2;
        border: 1px solid #999;
    }
    .operator {
        background-color: orange;
        color: white;
    }
</style>