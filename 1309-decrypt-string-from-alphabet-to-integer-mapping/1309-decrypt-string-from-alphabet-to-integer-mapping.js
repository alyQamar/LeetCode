/**
 * @param {string} s
 * @return {string}
 */
var freqAlphabets = function (s) {

    const baseNum1 = 'j'.charCodeAt(0);
    for (let i = baseNum1; i < baseNum1 + 17; i++) {
        let c = String.fromCharCode(i);
        s = s.replaceAll(String(i + 10 - baseNum1) + '#', c);
    }

    const baseNum2 = 'a'.charCodeAt(0);
    for (let i = baseNum2; i < baseNum2 + 9; i++) {
        let c = String.fromCharCode(i);
        s = s.replaceAll(i + 1 - baseNum2, c);
    }
    return s;
};
