require_relative "solution"
require "test/unit"
 
class TestSolution < Test::Unit::TestCase
 
  def test_simple
    assert_equal([2,3], Solution.new().intersectionArrays([1, 2, 3], [2, 3, 4]) )
    assert_equal([1,2], Solution.new().intersectionArrays([1, 2, 3], [1, 2, 5]) )
    assert_equal([], Solution.new().intersectionArrays([1, 2, 3], [4, 5, 6]) )
    assert_equal([], Solution.new().intersectionArrays([], []) )

    assert_equal([1, 2, 3, 4, 5], Solution.new().sortNumbers([1, 5, 3, 2, 4]) )
    assert_equal([1, 2, 3, 5, 8, 10], Solution.new().sortNumbers([10, 5, 3, 2, 8, 1]) )
    assert_equal( [-50, -1, 0, 10, 100], Solution.new().sortNumbers([0, -1, 10, 100, -50]) )
    assert_equal(  [1, 2, 3, 4, 5, 5], Solution.new().sortNumbers([5, 5, 4, 3, 2, 1]) )

    assert_equal(  [], Solution.new().sortNumbers([]) )

    assert_equal(  [[1, 5], [2, 4]], Solution.new().findPairs([1, 2, 3, 4, 5], 6) )

    assert_equal(  [[3, 5]], Solution.new().findPairs([1, 2, 3, 4, 5], 8) )

    assert_equal(  [[1, 3], [1, 3], [1, 3], [1, 3], [2, 2], [2, 2], [3, 1], [3, 1], [3, 1], [3, 1]], Solution.new().findPairs([1, 1, 2, 2, 3, 3], 4) )
    
    assert_equal(  [[-2, 3], [-1, 2], [0, 1]], Solution.new().findPairs([-2, -1, 0, 1, 2, 3], 1) )
    
  
  end
 
end