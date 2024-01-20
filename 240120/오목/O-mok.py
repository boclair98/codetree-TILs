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
        if omok[j][i] == 1 and omok[j+1][i]==1 and omok[j+2][i]==1 and omok[j+3][i]==1 and omok[j+4][i] == 1:
                omok_true = True
                cntx = j +2
                cnty = i
                tal = 1
                break
        if omok[j][i] == 1 and omok[j+1][i]==1 and omok[j+2][i]==1 and omok[j+3][i]==1 and omok[j+4][i] == 1:
                omok_true = True
                cntx = j + 2
                cnty = i
                tal = 2
                break
if omok_true==True:
    print(tal)
    print(cntx+1,cnty+1)
elif omok_true ==False:

    for i in range(15):
        for j in range(15):
            if omok[i][j] == 1 and omok[i+1][j+1] == 1 and omok[i+2][j+2]==1 and omok[i+3][j+3] ==1 and omok[i+4][j+4] == 1:
                omok_true=True
                cntx = i + 2
                cnty = j+2
                tal = 1
                break
            if omok[i][j] == 2 and omok[i+1][j+1] == 2 and omok[i+2][j+2]==2 and omok[i+3][j+3] ==2 and omok[i+4][j+4] == 2:
                omok_true=True
                cntx = i+2
                cnty = j+2
                tal = 2
                break
    if omok_true==True:
        print(tal)
        print(cntx+1,cnty+1)