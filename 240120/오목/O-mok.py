omok = []

for _ in range(19):
    omok.append(list(map(int, input().split())))

def check_winner():
    for i in range(19):
        for j in range(15):
            # 가로
            if omok[i][j] == omok[i][j+1] == omok[i][j+2] == omok[i][j+3] == omok[i][j+4] and omok[i][j] != 0:
                return omok[i][j], i, j+2
            # 세로
            if omok[j][i] == omok[j+1][i] == omok[j+2][i] == omok[j+3][i] == omok[j+4][i] and omok[j][i] != 0:
                return omok[j][i], j+2, i

    for i in range(15):
        for j in range(15):
            # 대각선 \
            if omok[i][j] == omok[i+1][j+1] == omok[i+2][j+2] == omok[i+3][j+3] == omok[i+4][j+4] and omok[i][j] != 0:
                return omok[i][j], i+2, j+2
            # 대각선 /
            if j >= 4 and omok[i][j] == omok[i+1][j-1] == omok[i+2][j-2] == omok[i+3][j-3] == omok[i+4][j-4] and omok[i][j] != 0:
                return omok[i][j], i+2, j-3

    return 0, 0, 0  # 무승부

winner, row, col = check_winner()

if winner != 0:
    print(winner)
    print(row+1, col+1)
else:
    print("0")