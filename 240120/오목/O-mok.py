omok = []

for _ in range(19):
    omok.append(list(map(int,input().split())))

omok_true = False
cntx = 0
cnty = 0 
for i in range(19):
    for j in range(15):
        if omok[i][j]==1 and omok[i][j+1]==1 and omok[i][j+2]==1 and omok[i][j+3]==1 and omok[i][j+4]==1:
            omok_true = True
            cntx = i
            cnty = j+2
            tal = 1
            break
        if omok[i][j]==2 and omok[i][j+1]==2 and omok[i][j+2]==2 and omok[i][j+3]==2 and omok[i][j+4]==2:
            omok_true = True
            cntx = i
            cnty = j+2
            tal = 2
            break
if omok_true==True:
    print(tal)
    print(cntx,cnty)