const Controller = require('./Controller');

class DefaultController {
  constructor(Service) {
    this.service = Service;
  }

  async addExpense(request, response) {
    await Controller.handleRequest(request, response, this.service.addExpense);
  }

  async getExpense(request, response) {
    await Controller.handleRequest(request, response, this.service.getExpense);
  }

  async getExpenses(request, response) {
    await Controller.handleRequest(request, response, this.service.getExpenses);
  }

  async getResult(request, response) {
    await Controller.handleRequest(request, response, this.service.getResult);
  }

}

module.exports = DefaultController;
