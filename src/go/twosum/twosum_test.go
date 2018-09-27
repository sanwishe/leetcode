package twosum

import (
	"testing"
	"fmt"
)

func TestTwosum(t *testing.T) {
	//given
	nums := []int{2, 7, 15, 18}
	target := 33
	expect := []int{2, 3}

	//when
	act := twoSum(nums, target)

	fmt.Printf("act[0]=%d, expect[0]=%d, res=%v\n", act[0], expect[0], expect[0] == act[0])
	fmt.Printf("act[1]=%d, expect[1]=%d, res=%v\n", act[1], expect[1], expect[1] == act[1])
}
