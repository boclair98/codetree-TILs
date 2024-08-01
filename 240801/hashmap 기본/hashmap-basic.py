n = int(input())
dic = {}
for _ in range(n):
    s = input().split()
    if s[0] == 'add':
        dic[s[1]] = s[2] 
    if s[0] =='find':
        if s[1] in dic :
            print(dic[s[1]])
        else:
            print('None')
    if s[0] =='remove':
        dic.pop(s[1])