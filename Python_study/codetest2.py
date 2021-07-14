result = []
lastC = []
def solution(n, k, cmd):
    global lastC
    global result
    for i in range(n):
        result.append('O')
    for c in cmd:
        cmdspl = c.split()
        if cmdspl[0]=='C':
            lastC.append(k)
            result[k] ='X'       
        elif cmdspl[0]=='Z':
            if len(lastC)>0:
                result[lastC[-1]]='O'
                lastC.remove(lastC[-1])
        elif cmdspl[0]=='D':
            x = int(cmdspl[1])
            if k+x <n-1:
                k += x
        elif cmdspl[0]=='U':
            x = int(cmdspl[1])
            if k-x >=0:
                k -= x
    answer = ''.join(result)
    return answer

n = 8
k = 2
cmd = ["D 2", "C", ]
print(solution(n, k, cmd))