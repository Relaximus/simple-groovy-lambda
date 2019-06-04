package com.relaximus

import com.amazonaws.services.lambda.runtime.Context
import groovy.transform.CompileStatic

@CompileStatic
class SimpleLambda {
    String handler(Map data, Context context) {
        "Hi, dear ${data.name}"
    }
}
