def Bomb(s,n):
    S = list(s)
    N = list(n)
    i = 0
    limit = len(S)-1
    while(i<limit):
        if(S[i] == 'C'):
            if(S[i+1] == '4'):
                S.pop(i)
                S.pop(i)
                limit -= 2
        i += 1
    i = 0
    limit = len(S)-1
    while(i<limit):
        if(S[i] == 'C'):
            if(S[i+1] == '4'):
                S.pop(i)
                S.pop(i)
                limit -= 2
        i += 1
    t = ''
    for i in range(len(S)):
        t += S[i]
    return t
s = input()
n = input()
print(Bomb(s,n))

