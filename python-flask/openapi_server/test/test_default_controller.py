# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.expense_request import ExpenseRequest  # noqa: E501
from openapi_server.models.expense_response import ExpenseResponse  # noqa: E501
from openapi_server.models.expenses_response import ExpensesResponse  # noqa: E501
from openapi_server.models.not_found import NotFound  # noqa: E501
from openapi_server.models.result_response import ResultResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_add_expense(self):
        """Test case for add_expense

        adds a expense
        """
        expense_request = {
  "date" : "2019-10-22T00:00:00.000+0000",
  "amount" : 100,
  "content" : "おにぎり"
}
        headers = { 
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/expenses',
            method='POST',
            headers=headers,
            data=json.dumps(expense_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_expense(self):
        """Test case for get_expense

        gets a expense
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/expenses/{expense_id}'.format(expense_id='expense_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_expenses(self):
        """Test case for get_expenses

        gets expenses
        """
        query_string = [('beginDate', Tue Oct 01 09:00:00 JST 2019),
                        ('endDate', Thu Oct 31 09:00:00 JST 2019)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/expenses',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_result(self):
        """Test case for get_result

        gets Result
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/results/{result_id}'.format(result_id=2019-10),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
