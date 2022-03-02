package ro.ase.acs.example2;

public class DiscountCalculations {
	
	public float calculateDiscountBasedOnProductAvailabilityAndClient(ProductType productType, float productPrice, int percentageDiscount)
	  {
	    
	    float discount = (percentageDiscount > 10) ? (float)30/100 : (float)percentageDiscount/100; 
	    
	    float[] discountProductType = {0f, 0.1f, 0.25f, 0.35f};
	    
	    if(productType.getId() <= ProductType.CRITICAL_AVAILABILITY.getId() && productType.getId() >= ProductType.HIGH_AVAILABILITY.getId()) {
	    	
	    	if(productType == ProductType.HIGH_AVAILABILITY) {
	    		return productPrice;
	    	}
	    	
	    	return (productPrice - (discountProductType[productType.getId()-1] * productPrice)) - discount * (productPrice - (discountProductType[productType.getId()-1] * productPrice));
	    }
	    else {
	    	return 0;
	    }
	    
	    
	    /*
	    if (productType == 1)
	    {
	    	return productPrice;
	    }
	    else if (productType == 2)
	    {
	    	return (productPrice - (discountProductType[productType-1] * productPrice)) - discount * (productPrice - (discountProductType[productType-1] * productPrice));
	    }
	    else if (productType == 3)
	    {
	    	return (productPrice - (discountProductType[productType-1] * productPrice)) - discount * (productPrice - (discountProductType[productType-1] * productPrice));
	    }
	    else if (productType == 4)
	    {
	    	return (productPrice - (discountProductType[productType-1] * productPrice)) - discount * (productPrice - (discountProductType[productType-1] * productPrice));
	    }
	    return 0;
	    */
	  }

}
