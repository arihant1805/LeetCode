class Solution(object):
    def reverse(self, x):
        def reverse(s):
            if len(s) == 0:
                return s
            else:
                return reverse(s[1:]) + s[0]
        q=0
        if x<0:
            q=1
        x=str(x)
        x=reverse(x)
        if q==0 :
            x=int(x)
        else :
            x=-int(x[:len(x)-1])
        
        if x > 2**31 or x<-(2**31-1):
            return 0
        return x

        """
        :type x: int
        :rtype: int
        """
        
