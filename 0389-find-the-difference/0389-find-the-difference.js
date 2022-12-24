/**
 * @param {string} s
 * @param {string} t
 * @return {character}
 */
var findTheDifference = function (s, t) {
    s = s.split("").sort().join("");
    t = t.split("").sort().join("");
    for (let i = 0; i < t.length; i++) {
        if (s[i] != t[i]) {
            return t[i];
        } else if (i == s.length - 1) {
            return t[s.length];
        }
    }
};