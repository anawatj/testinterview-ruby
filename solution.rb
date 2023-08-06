class Solution

    #EASY 1
    def intersectionArrays(a,b)
        a & b
    end
    # MIDIUM 2
    def sortNumbers(a)
        a.sort()
    end
    #HARD 3
    def findPairs(a,n)
       s=a.clone
       s.uniq! == nil ? a.combination(2).to_a.select{|a,b| a+b==n}:a.permutation(2).to_a.select{|a,b| a+b==n}
   
       
    end
end

