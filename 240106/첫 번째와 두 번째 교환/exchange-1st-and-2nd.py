word = input()

tot_word =""

fir_word = word[0]
two_word = word[1]

for i in word:
    if i ==fir_word:
        tot_word+=two_word
    elif i==two_word:
        tot_word+=fir_word
    else:
        tot_word+=i
print(tot_word)