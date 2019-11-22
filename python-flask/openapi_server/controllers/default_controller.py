import connexion
import six

from openapi_server.models.expense_request import ExpenseRequest  # noqa: E501
from openapi_server.models.expense_response import ExpenseResponse  # noqa: E501
from openapi_server.models.expenses_response import ExpensesResponse  # noqa: E501
from openapi_server.models.not_found import NotFound  # noqa: E501
from openapi_server.models.result_response import ResultResponse  # noqa: E501
from openapi_server import util


def add_expense(expense_request=None):  # noqa: E501
    """adds a expense

    支出を登録する # noqa: E501

    :param expense_request: expense object
    :type expense_request: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        expense_request = ExpenseRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_expense(expense_id):  # noqa: E501
    """gets a expense

    支出詳細を取得する  # noqa: E501

    :param expense_id: 
    :type expense_id: str

    :rtype: ExpenseResponse
    """
    return 'do some magic!'


def get_expenses(begin_date=None, end_date=None):  # noqa: E501
    """gets expenses

    支出一覧を取得する # noqa: E501

    :param begin_date: 開始日
    :type begin_date: str
    :param end_date: 終了日
    :type end_date: str

    :rtype: ExpensesResponse
    """
    begin_date = util.deserialize_date(begin_date)
    end_date = util.deserialize_date(end_date)
    return 'do some magic!'


def get_result(result_id):  # noqa: E501
    """gets Result

    その月の収支結果を取得する  # noqa: E501

    :param result_id: 
    :type result_id: str

    :rtype: ResultResponse
    """
    return 'do some magic!'
