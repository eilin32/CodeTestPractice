import numpy as np
def solution(numbers, hand):
    pad = np.array([[1,4,7,10],[2,5,8,0],[3,6,9,11]])
    left = 10
    right = 11
    lxd = ''
    rxd =''
    answer = ''
    for x in numbers:
        if x in pad[0]:
            answer+='L'
            left = x
        elif x in pad[2]:
            answer+='R'
            right = x
        else :
            lxd =abs(np.where(pad==left)[0]-np.where(pad==x)[0])+abs(np.where(pad==left)[1]-np.where(pad==x)[1])
            rxd =abs(np.where(pad==right)[0]-np.where(pad==x)[0])+abs(np.where(pad==right)[1]-np.where(pad==x)[1])
            if lxd == rxd :
                if hand == 'right':
                    answer+='R'
                    right = x
                else:
                    answer+='L'
                    left = x
            elif lxd > rxd :
                answer +='R'
                right=x
            else :
                answer +='L'
                left=x
            
                    
    return answer
