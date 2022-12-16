/**
 * @param {string} word1
 * @param {string} word2
 * @return {string}
 */

//leetcode
var mergeAlternately = function (word1, word2) {
    let word = '';
    const max = word1.length > word2.length ? word1.length : word2.length;
    for (let i = 0; i < max; i++) {
        if (i < word1.length) {
            word += word1[i];
        }

        if (i < word2.length) {
            word += word2[i];

        }
    }
    return word;
};