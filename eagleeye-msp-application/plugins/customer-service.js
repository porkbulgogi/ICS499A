export default (context, inject) => {
  const customerApi = {
    async getStates() {
      return await context.$axios
        .$get('/api/eagleeye-msp/v1/customers/states')
        .then((response) => {
          return response
        })
        .catch((e) => {
          context.error({
            statusCode: e.response.status,
            message: 'Unable to get valid states.'
          })
        })
    },
    async getCustomer(id) {
      return await context.$axios
        .$get(`/api/eagleeye-msp/v1/customers/${id}`)
        .then((response) => {
          return response
        })
        .catch((e) => {
          context.error({
            statusCode: e.response.status,
            message: `Unable to get customer: ${id}.`
          })
        })
    },
    async getCustomers() {
      return await context.$axios
        .$get('/api/eagleeye-msp/v1/customers')
        .then((response) => {
          return response
        })
        .catch((e) => {
          context.error({
            statusCode: e.response.status,
            message: 'Unable to get customers.'
          })
        })
    },
    async saveCustomer(customer) {
      return await context.$axios
        .$put('/api/eagleeye-msp/v1/customers', customer)
        .then((response) => {
          return response
        })
        .catch((e) => {
          if (e.response.status === 400) {
            return e.response.data
          }
          context.error({
            statusCode: e.response.status,
            message: 'Unable to save customer.'
          })
        })
    }
  }
  inject('customerApi', customerApi)
  context.$customerApi = customerApi
}
