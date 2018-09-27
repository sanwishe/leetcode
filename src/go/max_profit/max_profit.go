package max_profit

func maxPrices(prices []int) int {
	if len(prices) == 0 {
		return 0
	}

	earned := 0
	for i := 1; i < len(prices); i++ {
		if prices[i] > prices[i-1] {
			earned += prices[i] - prices[i-1]
		}
	}

	return earned
}
