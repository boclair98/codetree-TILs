word = list(input())
word_len = len(word)

while word_len>1:
    
    n = int(input())
    if n>=word_len:
        n = word_len - 1
    word.pop(n)
    word_len-=1

    print(''.join(word))