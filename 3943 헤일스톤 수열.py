n = int(input())
num = []
temp = 1
k = 0
for i in range(n):
    k = int(input())
    num.append(k)
    
for i in range(len(num)):
    while(not num[i] == 1):
        if(num[i] > temp):
            temp = num[i]
        if(num[i]%2==0):
            num[i] = num[i]/2
        else:
            num[i] = (num[i]*3)+1
    num[i] = round(temp)
    temp = 1
print(num)
