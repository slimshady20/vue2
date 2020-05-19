<template>
    <div>
        <h2>Login Form</h2>

        <form method="post">


            <div class="container">

                <input type="text"  v-model="userid" placeholder="Enter Username" name="userid" required>
                <h3>입력한 아이디: {{userid}}</h3>
                <label><b></b></label>
                <input type="password" v-model="password" placeholder="Enter Password" name="password" required>
                <h3>입력한 비밀번호: {{password}}</h3>
                <div id="example-3">취미
                <input type="checkbox" id="Java" value="Java" v-model="checkedNames">
                <label for="Java">Java</label>
                <input type="checkbox" id="JavaScript" value="JavaScript" v-model="checkedNames">
                <label for="JavaScript">JavaScript</label>
                <input type="checkbox" id="SQL" value="SQL" v-model="checkedNames">
                <label for="SQL">SQL</label>
                <br>
                <span>Checked names: {{ checkedNames }}</span>
                </div>

                <span>Multiline message is:</span>
                <p style="white-space: pre-line;">{{ message }}</p>
                <br>

                <textarea v-model="message" placeholder="add multiple lines"></textarea>
                <br>Gender<br><input type="radio" id="male" value="male" v-model="picked">
                <label for="male">남성</label>
                <br>
                <input type="radio" id="female" value="female" v-model="picked">
                <label for="female">여성</label>
                <br>
                <span>Picked: {{ picked }}</span><br>
                <br>통신사   <select v-model="selected">
                    <option disabled value="">Please select one</option>
                    <option>SKT</option>
                    <option>LG</option>
                    <option>KT</option>
                </select><br>
                <span>Selected: {{selected}}</span>
                <br>개인정보동의
                <input
                        type="checkbox"
                        v-model="toggle"
                        true-value="yes"
                        false-value="no"

                >

                <div>
                    <label>
                    <input type="checkbox" checked="checked" name="remember"> Remember me
                </label>
                </div>
                <button @click="signup" type="submit">회원가입</button>
            </div>

            <div class="container" style="background-color:#f1f1f1">
                <button type="button" class="cancelbtn">Cancel</button>
                <span class="psw">Forgot <a href="#">password?</a></span>
            </div>
        </form>
    </div>
</template>

<script>
    import {mapActions} from 'vuex'
    export default {
        data(){
            return{
                userid:'',
                checkedNames:[],
                password:'',
                message:'',
                picked:'',
                selected:'',
                toggle:''
            }
        },

        methods: mapActions([
            'signup'
        ])
    }
</script>

<style scoped>
    form {border: 3px solid #0be52f;}

    input[type=text], input[type=password] {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
    }
    textarea,select{
        border: 1px solid #171414;
        outline: 1px solid #1e5180
    }

    button {
        background-color: #0e0601;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 100%;
    }

    button:hover {
        opacity: 0.8;
    }

    .cancelbtn {
        width: auto;
        padding: 10px 18px;
        background-color: #001dd4;
    }

    .imgcontainer {
        text-align: center;
        margin: 24px 0 12px 0;
    }

    img.avatar {
        width: 40%;
        border-radius: 50%;
    }

    .container {
        padding: 16px;
    }

    span.psw {
        float: right;
        padding-top: 16px;
    }

    /* Change styles for span and cancel button on extra small screens */
    @media screen and (max-width: 300px) {
        span.psw {
            display: block;
            float: none;
        }
        .cancelbtn {
            width: 100%;
        }
    }
</style>