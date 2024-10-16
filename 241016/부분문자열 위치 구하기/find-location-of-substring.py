word = input()
ix = input()

booll = False 
cnt = 0 
for i in range(len(word)-len(ix)+1):
    for j in range(len(ix)):
        if word[i+j] == ix[j]:
            booll = True 
        else:
            continue
    if booll:
        cnt = i   + 1
        break 
print(cnt)