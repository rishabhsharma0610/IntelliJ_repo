#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "ns_string.h"
#ifdef ENABLE_RUNLOGIC_PROGRESS
  #define UPDATE_USER_FLOW_COUNT(count) update_user_flow_count(count);
#else
  #define UPDATE_USER_FLOW_COUNT(count)
#endif


extern int init_script();
extern int exit_script();

typedef void FlowReturn;

// Note: Following extern declaration is used to find the list of used flows. Do not delete/edit it
// Start - List of used flows in the runlogic
extern FlowReturn 01_Tx_Index();
extern FlowReturn 02_Tx_Login();
extern FlowReturn 03_Tx_SearchFlight();
extern FlowReturn 04_Tx_SelectFlight();
extern FlowReturn 05_Tx_FillForm();
extern FlowReturn 06_Tx_Invoice();
extern FlowReturn 07_Tx_Welcome();
// End - List of used flows in the runlogic


void runlogic()
{
    NSDL2_RUNLOGIC(NULL, NULL, "Executing init_script()");

    init_script();

    NSDL2_RUNLOGIC(NULL, NULL, "Executing sequence block - Block1");
    {
        UPDATE_USER_FLOW_COUNT(0)

        NSDL2_RUNLOGIC(NULL, NULL, "Executing sequence block - 01_Tx_Index");
        {
            UPDATE_USER_FLOW_COUNT(1)
            NSDL2_RUNLOGIC(NULL, NULL, "Executing flow - 01_Tx_Index");
            UPDATE_USER_FLOW_COUNT(2)
            01_Tx_Index();
        }

        NSDL2_RUNLOGIC(NULL, NULL, "Executing sequence block - 02_Tx_Login");
        {
            UPDATE_USER_FLOW_COUNT(4)
            NSDL2_RUNLOGIC(NULL, NULL, "Executing flow - 02_Tx_Login");
            UPDATE_USER_FLOW_COUNT(5)
            02_Tx_Login();
        }

        NSDL2_RUNLOGIC(NULL, NULL, "Executing sequence block - 03_Tx_SearchFlight");
        {
            UPDATE_USER_FLOW_COUNT(7)
            NSDL2_RUNLOGIC(NULL, NULL, "Executing flow - 03_Tx_SearchFlight");
            UPDATE_USER_FLOW_COUNT(8)
            03_Tx_SearchFlight();
        }

        NSDL2_RUNLOGIC(NULL, NULL, "Executing sequence block - 04_Tx_SelectFlight");
        {
            UPDATE_USER_FLOW_COUNT(10)
            NSDL2_RUNLOGIC(NULL, NULL, "Executing flow - 04_Tx_SelectFlight");
            UPDATE_USER_FLOW_COUNT(11)
            04_Tx_SelectFlight();
        }

        NSDL2_RUNLOGIC(NULL, NULL, "Executing sequence block - 05_Tx_FillForm");
        {
            UPDATE_USER_FLOW_COUNT(13)
            NSDL2_RUNLOGIC(NULL, NULL, "Executing flow - 05_Tx_FillForm");
            UPDATE_USER_FLOW_COUNT(14)
            05_Tx_FillForm();
        }

        NSDL2_RUNLOGIC(NULL, NULL, "Executing sequence block - 06_Tx_Invoice");
        {
            UPDATE_USER_FLOW_COUNT(16)
            NSDL2_RUNLOGIC(NULL, NULL, "Executing flow - 06_Tx_Invoice");
            UPDATE_USER_FLOW_COUNT(17)
            06_Tx_Invoice();
        }

        NSDL2_RUNLOGIC(NULL, NULL, "Executing sequence block - 07_Tx_Welcome");
        {
            UPDATE_USER_FLOW_COUNT(19)
            NSDL2_RUNLOGIC(NULL, NULL, "Executing flow - 07_Tx_Welcome");
            UPDATE_USER_FLOW_COUNT(20)
            07_Tx_Welcome();
        }
    }

    NSDL2_RUNLOGIC(NULL, NULL, "Executing ns_exit_session()");
    ns_exit_session();
}
