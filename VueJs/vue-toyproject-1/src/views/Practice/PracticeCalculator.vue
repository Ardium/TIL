<!-- PracticeCalculator.vue -->

<template>
    <div id="wrapCalculator">
        <div id="calgrp">
            <div id="expgrp">
                <div id="numexp_result">
                    {{ strResult }}
                </div>
                <div id="numexp_input">
                    {{ strInput }}
                </div>
            </div>
            <div id="btngrp">
                <div class="btnrow">
                    <button v-on:click="clickBackspaceBtn">←</button>
                    <button v-on:click="clickClearBtn('CE')">CE</button>
                    <button v-on:click="clickClearBtn('AC')">AC</button>
                    <button v-on:click="clickCalculateBtn('*')">X</button>
                </div>
                <div class="btnrow">
                    <button v-on:click="clickNumberBtn('7')">7</button>
                    <button v-on:click="clickNumberBtn('8')">8</button>
                    <button v-on:click="clickNumberBtn('9')">9</button>
                    <button v-on:click="clickCalculateBtn('/')">/</button>
                </div>
                <div class="btnrow">
                    <button v-on:click="clickNumberBtn('4')">4</button>
                    <button v-on:click="clickNumberBtn('5')">5</button>
                    <button v-on:click="clickNumberBtn('6')">6</button>
                    <button v-on:click="clickCalculateBtn('-')">-</button>
                </div>
                <div class="btnrow">
                    <button v-on:click="clickNumberBtn('1')">1</button>
                    <button v-on:click="clickNumberBtn('2')">2</button>
                    <button v-on:click="clickNumberBtn('3')">3</button>
                    <button v-on:click="clickCalculateBtn('+')">+</button>
                </div>
                <div class="btnrow">
                    <button v-on:click="clickNumberBtn('000')">000</button>
                    <button v-on:click="clickNumberBtn('0')">0</button>
                    <button v-on:click="clickCalculateBtn('.')">.</button>
                    <button v-on:click="clickCalculateBtn('=')">=</button>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    data: function() {
        return {
            strResult: '0',
            strInput: '0',
            strLastInput: '0',
        };
    },
    methods: {
        printLog: function (btnName) {
            console.log('Press the ' + btnName + ' button');
        },

        // Calculator Button
        clickNumberBtn: function (strNum) {
            this.printLog(strNum);
            this.strLastInput = strNum;

            if (this.strInput == '0') {
                if (strNum != '000' &&
                    strNum != '0') {
                    this.strInput = strNum;
                }
            }
            else {
                this.strInput += strNum;
            }
        },
        clickCalculateBtn: function (strSymbol) {
            this.printLog(strSymbol);
            if (strSymbol == '=') {
                // 연산 수식
                this.strResult = this.strInput.trimEnd();

                // 연산 수행 및 결과
                const elements = this.strResult.split(' ');
                let numResult = parseFloat(elements[0]);
                for (let i = 1; i < elements.length; i += 2) {
                    console.log('numResult:' + numResult);
                    console.log('elements[i]: ' + elements[i]);
                    console.log('elements[i+1]: ' + elements[i + 1]);

                    if (elements[i] == '*') {
                        numResult *= parseFloat(elements[i + 1]);
                    }
                    else if (elements[i] == '/') {
                        numResult /= parseFloat(elements[i + 1]);
                    }
                    else if (elements[i] == '-') {
                        numResult -= parseFloat(elements[i + 1]);
                    }
                    else if (elements[i] == '+') {
                        numResult += parseFloat(elements[i + 1]);
                    }
                }
                console.log('numResult:' + numResult);
                this.strInput = numResult.toString();
                this.strLastInput = this.strInput;
            }
            else if (strSymbol == '.') {
                this.strInput += strSymbol;
            }
            else if (this.strLastInput != '*' &&
                this.strLastInput != '/' &&
                this.strLastInput != '-' &&
                this.strLastInput != '+') {
                this.strLastInput = strSymbol;
                this.strInput += ' ' + strSymbol + ' ';
            }
            else {
                alert('Press number button!!!');
            }
        },

        // Clear Button
        clickBackspaceBtn: function () {
            this.printLog('Backspace Button');
            this.strInput = this.strInput.substring(0, this.strInput.length - 1);

            if (this.strInput.length == 0) {
                this.strInput = '0';
            }
        },
        clickClearBtn: function(strSymbol) {
            this.printLog('Clear ' + strSymbol + ' Button');
            this.strInput = '0';

            if (strSymbol == 'AC') {
                this.strResult = '0';
                this.strLastInput = '0';
            }
        }
    }
}
</script>

<style scoped>
#wrapCalculator {
    padding: 5px;
    width: 260px;
}

#wrapCalculator h2 {
    padding: 5px;
    text-align: center;

    background-color: white;
}

#calgrp {
    padding: 5px;
    background-color: white;
    border: 2px dotted black;
}

/* STYLE: Expression group of the Calculator */
#expgrp {
    padding: 5px;
    background-color: lightcoral;
    text-align: right;
    color: white;
}

#numexp_result {
    margin: 5px 5px 0px 5px;

    font-size: x-small;
}

#numexp_input {
    margin: 0px 5px 0px 5px;
    font-size: x-large;
}

/* STYLE: Button group of the calculator */
.btnrow {
    margin: 5px;

    border: 2px solid white;
}

#btngrp button {
    margin: 5px;
    padding: 10px;

    background-color: lightcoral;
    border-color: white;

    text-align: center;
    font-size: medium;
    width: 45px;
    height: 45px;
}
</style>