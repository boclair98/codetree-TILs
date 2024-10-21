s = input()
while True:
    idx = int(input())
    if idx >= len(s):
        s = s[:len(s)-1]
        print(s)
    else:
        s = s[:idx] + s[idx+1:]
        print(s)
    if len(s) == 1:
        break