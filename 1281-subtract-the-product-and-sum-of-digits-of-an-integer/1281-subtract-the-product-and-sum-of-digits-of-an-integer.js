/**
 * @param {number} n
 * @return {number}
 */
var subtractProductAndSum = function (n) {
  let s = n.toString(), sum = 0, prod = 1;

  for (let i = 0; i < s.length; i++) {
    sum +=  Number(s[i]);
    prod *= Number(s[i]);
  }
  return prod - sum;
};