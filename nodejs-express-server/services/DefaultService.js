/* eslint-disable no-unused-vars */
const Service = require('./Service');

class DefaultService {

  /**
   * adds a expense
   * 支出を登録する
   *
   * expenseRequest ExpenseRequest expense object (optional)
   * no response value expected for this operation
   **/
  static addExpense({ expenseRequest }) {
    return new Promise(
      async (resolve) => {
        try {
          resolve(Service.successResponse(''));
        } catch (e) {
          resolve(Service.rejectResponse(
            e.message || 'Invalid input',
            e.status || 405,
          ));
        }
      },
    );
  }

  /**
   * gets a expense
   * 支出詳細を取得する 
   *
   * expenseId String 
   * returns ExpenseResponse
   **/
  static getExpense({ expenseId }) {
    return new Promise(
      async (resolve) => {
        try {
          resolve(Service.successResponse(''));
        } catch (e) {
          resolve(Service.rejectResponse(
            e.message || 'Invalid input',
            e.status || 405,
          ));
        }
      },
    );
  }

  /**
   * gets expenses
   * 支出一覧を取得する
   *
   * beginDate date 開始日 (optional)
   * endDate date 終了日 (optional)
   * returns ExpensesResponse
   **/
  static getExpenses({ beginDate, endDate }) {
    return new Promise(
      async (resolve) => {
        try {
          resolve(Service.successResponse(''));
        } catch (e) {
          resolve(Service.rejectResponse(
            e.message || 'Invalid input',
            e.status || 405,
          ));
        }
      },
    );
  }

  /**
   * gets Result
   * その月の収支結果を取得する 
   *
   * resultId String 
   * returns ResultResponse
   **/
  static getResult({ resultId }) {
    return new Promise(
      async (resolve) => {
        try {
          resolve(Service.successResponse(''));
        } catch (e) {
          resolve(Service.rejectResponse(
            e.message || 'Invalid input',
            e.status || 405,
          ));
        }
      },
    );
  }

}

module.exports = DefaultService;
