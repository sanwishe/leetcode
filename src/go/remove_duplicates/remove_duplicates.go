package remove_duplicates

func removeDuplicates(nums []int) int {
	if len(nums) == 0 {
		return 0
	}

	pos := 0
	for i := 1; i < len(nums); i++ {
		if nums[pos] != nums[i] {
			nums[pos+1] = nums[i]
			pos++
		}
	}

	return pos + 1
}
