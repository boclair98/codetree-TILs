word = input()
ix = input()

booll = False 
cnt = -1
for i in range(len(word)-len(ix)+1):
    if word[i:i+len(ix)] == ix:
        cnt = i 
        break
print(cnt)