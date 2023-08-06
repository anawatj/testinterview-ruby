class Solution

    #EASY
    def intersectionArrays(a,b)
        a & b
    end
    # MIDIUM
    def sortNumbers(a)
        a.sort()
    end
    #HARD
    def findPairs(a,n)
       s=a.clone
       s.uniq! == nil ? a.combination(2).to_a.select{|a,b| a+b==n}:a.permutation(2).to_a.select{|a,b| a+b==n}
   
       
    end
end

