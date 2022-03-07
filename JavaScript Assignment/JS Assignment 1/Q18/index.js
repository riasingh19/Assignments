const pigLatinSentence = (s) => {
    let ans = "";
    for (let i = 0; i < s.length; i++) {
        let j = i;
        if (i >= s.length)
            break;
        while (i < s.length && s.charAt(i) != ' ')
            i++;
        if (ans.length === 0) {
            ans = ans + s.substring(j + 1, i) + s.charAt(j) + "ay";
        }
        else {
            ans = ans + " " + s.substring(j + 1, i) + s.charAt(j) + "ay";
        }
    }
    return ans;
}

// Driver code

let s = "The quick brown fox becomes ";
document.write(pigLatinSentence(s));