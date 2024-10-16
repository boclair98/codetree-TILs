s = input()

req = False
req2 = False

for i in range(len(s)-1):
    if s[i]=='e' and s[i+1] =='e':
        req = True
    if s[i] =='a' and s[i+1]=='b':
        req2 = True
if req:
    print("Yes",end=' ')
else:
    print("No",end=' ')

if req2:
    print("Yes",end=' ')
else:
    print("No",end=' ')