// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: common.proto

package com.ai.procyon.grpc.common;

/**
* Validates {@code ServiceActions} protobuf objects.
*/
public class ServiceActionsValidator implements io.envoyproxy.pgv.ValidatorImpl<com.ai.procyon.grpc.common.ServiceActions>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(com.ai.procyon.grpc.common.ServiceActions.class)) return new ServiceActionsValidator();
		
		return null;
	}
		
	
	

	public void assertValid(com.ai.procyon.grpc.common.ServiceActions proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.RepeatedValidation.forEach(proto.getServiceActionsList(), item -> {
				
			// Validate ServiceActions
			if (true) index.validatorFor(item).assertValid(item);
			});

	
	}

}

