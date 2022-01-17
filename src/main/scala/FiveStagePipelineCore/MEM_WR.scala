package FiveStagePipelineCore
import chisel3._
import chisel3.utils._

class MEM_WB extends Module {
    val io = IO(new Bundle{
        //Inputs
        val EX_MEM_load_in = Input(UInt(1.W))
        val EX_MEM_REGWR_in = Input(UInt(1.W))
        val EX_MEM_RDSEL_in = Input(UInt(5.W))
        val in_dataMEM_data_in = Input(SInt(32.W))
        val in_alu_Output_in = Input(SInt(32.W))

        //Outputs
        val EX_MEM_load_out = Output(UInt(1.W))
        val EX_MEM_REGWR_out = Output(UInt(1.W))
        val EX_MEM_RDSEL_out = Output(UInt(5.W))
        val in_dataMEM_data_out = Output(SInt(32.W))
        val in_alu_Output_out = Output(SInt(32.W))
    })
        //RegInit
        val EX_MEM_load_reg = RegInit(UInt(1.W))
        val EX_MEM_REGWR_reg = RegInit(UInt(1.W))
        val EX_MEM_RDSEL_reg = RegInit(UInt(5.W))
        val in_dataMEM_data_reg = RegInit(SInt(32.W))
        val in_alu_Output_reg = RegInit(SInt(32.W))

        EX_MEM_load_reg := io.EX_MEM_load_in
        io.EX_MEM_load_out := EX_MEM_load_reg

        EX_MEM_REGWR_reg := io.EX_MEM_REGWR_in
        io.EX_MEM_REGWR_out := EX_MEM_REGWR_out

        EX_MEM_RDSEL_reg := io.EX_MEM_RDSEL_in
        io.EX_MEM_RDSEL_out := EX_MEM_RDSEL_reg

        in_dataMEM_data_reg := io.in_dataMEM_data_in
        io.in_dataMEM_data_out := in_dataMEM_data_reg

        in_alu_Output_reg := io.in_alu_Output_in
        io.in_alu_Output_out := in_alu_Output_reg
}