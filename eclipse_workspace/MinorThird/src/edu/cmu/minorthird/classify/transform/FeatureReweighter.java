package edu.cmu.minorthird.classify.transform;

import edu.cmu.minorthird.classify.Feature;
import edu.cmu.minorthird.classify.Instance;

/**
 * @author William Cohen
 * Date: Nov 21, 2003
 */

public interface FeatureReweighter 
{
	/** New weight for feature f in the given instance. */
	public double reweight(Feature f, Instance instance);
}
