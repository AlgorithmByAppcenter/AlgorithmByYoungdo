import math
def small(N):
    i = 1
    n = N
    while(True):
        if(N<100):
            temp = N
            a=math.floor(temp/10)
            temp=temp-(a*10)
            b=temp
            if(a==b):
                return N
        elif(N>100 and N<1000):
            temp = N
            a = math.floor(temp/100)
            temp = temp - (a*100)
            b = math.floor(temp/10)
            temp = temp - (b*10)
            c = temp
            if(b == c):
                return N
        i += 1
        N = n*i
        
    
N = int(input('N='))
print(small(N))
