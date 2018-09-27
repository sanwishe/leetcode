package max_profit

import (
	"testing"
	"fmt"
)

func TestMaxProfit(t *testing.T) {
	//given
	prices := []int{7, 1, 5, 3, 6, 4}
	expect := 7

	//when
	act := maxPrices(prices)

	//then
	fmt.Printf("act=%d, expect=%d, res=%v", act, expect, expect == act)
}
