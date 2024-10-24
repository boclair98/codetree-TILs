word = input()
search = input()

while True:

    if search in word:
        word = word[:word.index(search)]+word[word.index(search)+len(search):]
        
    else:
        print(word)
        break