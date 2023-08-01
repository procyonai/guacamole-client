// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: common.proto

package com.ai.procyon.grpc.common;

/**
* Validates {@code Rule} protobuf objects.
*/
public class RuleValidator implements io.envoyproxy.pgv.ValidatorImpl<com.ai.procyon.grpc.common.Rule>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(com.ai.procyon.grpc.common.Rule.class)) return new RuleValidator();
		
		if (clazz.equals(com.ai.procyon.grpc.common.Rule.Condition.class)) return new Rule_ConditionValidator();
		return null;
	}
		
	
		
	
	

	public void assertValid(com.ai.procyon.grpc.common.Rule proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.RepeatedValidation.forEach(proto.getConditionsList(), item -> {
				
			// Validate Conditions
			if (true) index.validatorFor(item).assertValid(item);
			});

	// no validation rules for Action

	
	}

	/**
	 * Validates {@code Rule_Condition} protobuf objects.
	 */
	public static class Rule_ConditionValidator implements io.envoyproxy.pgv.ValidatorImpl<com.ai.procyon.grpc.common.Rule.Condition> {
		
	
		
	
	

	public void assertValid(com.ai.procyon.grpc.common.Rule.Condition proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	// no validation rules for CredentialName

	
			// Validate LabelSelector
			if (proto.hasLabelSelector()) index.validatorFor(proto.getLabelSelector()).assertValid(proto.getLabelSelector());
	
	}
}

}

