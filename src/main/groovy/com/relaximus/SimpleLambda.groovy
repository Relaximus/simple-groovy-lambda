package com.relaximus

import com.amazonaws.services.lambda.runtime.Context

class SimpleLambda {
    String handler(data, Context context) {
        "Hi, dear ${data.name}"
    }
}
