package FiveStagePipelineCore
import chisel3._
import chisel3.utils._

class EX_MEM extends Modele {
    val io =  IO(new Bundle{
        //Inputs
        val load_in = Input(UInt(1.W))
        val store_in Input(UInt(1.W))
        val ID_EX_REGWR_in = Input(UInt(1.W))
        val ID_EX_rs2_in = Input(SInt(32.W))
        val ID_EX_RDSEL_in = Input(UInt(5.W))
        val ID_EX_RS2_SEL_in = Input(UInt(5.W))
        val alu_output_in = Input(UInt(32.W))

        //Outputs
        val load_out = Output(UInt(1.W))
        val store_out =  Output(UInt(1.W))
        val ID_EX_REGWR_out = Output(UInt(1.W))
        val ID_EX_rs2_out = Output(SInt(32.W))
        val ID_EX_RDSEL_out = Output(UInt(5.W))
        val ID_EX_RS2_SEL_out = Output(UInt(5.W))
        val alu_output_out = Output(UInt(32.W))

    })

        val load_reg = RegInit(UInt(1.W))
        val store_reg = RegInit(UInt(1.W))
        val ID_EX_REGWR_reg = RegInit(UInt(1.W))
        val ID_EX_rs2_reg = RegInit(SInt(32.W))
        val ID_EX_RDSEL_reg = RegInit(UInt(5.W))
        val ID_EX_RS2_SEL_reg = RegInit(UInt(5.W))
        val alu_output_reg = RegInit(UInt(32.W))

        load_reg := io.load_in
        io.load_out := load_reg

        store_reg := io.store_in
        io.store_out := store_reg

        ID_EX_REGWR_reg := io.ID_EX_REGWR_in
        io.ID_EX_REGWR_out := ID_EX_REGWR_out

        ID_EX_RDSEL_reg := io.ID_EX_RDSEL_in
        io.ID_EX_RDSEL_out := ID_EX_RDSEL_reg

        ID_EX_rs2_reg := io.ID_EX_rs2_in
        io.ID_EX_rs2_out := ID_EX_rs2_reg

        ID_EX_RS2_SEL_reg := io.ID_EX_RS2_SEL_in
        io.ID_EX_RS2_SEL_out := ID_EX_RS2_SEL_reg

        alu_output_reg := io.alu_output_in
        io.alu_output_out := alu_output_reg

}