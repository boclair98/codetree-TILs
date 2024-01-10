word = input()

def pall(word):
    if word == word[::-1]:
        return True
    else:
        return False

if pall(word):
    print("Yes")
else:
    print('No')