org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/products/2'
    }
    response {
        status 200
        body("""
            {
                "id": 2,
                "name": "Dummy Product"
            }
        """)
    }
}