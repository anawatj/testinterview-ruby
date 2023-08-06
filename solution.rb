class Solution
    def intersectionArrays(a,b)
        a & b
    end
    def sortNumbers(a)
        a.sort()
    end
    def findPairs(a,n)
       s=a.clone
       s.uniq! == nil ? a.combination(2).to_a.select{|a,b| a+b==n}:a.permutation(2).to_a.select{|a,b| a+b==n}
   
       
    end
end

