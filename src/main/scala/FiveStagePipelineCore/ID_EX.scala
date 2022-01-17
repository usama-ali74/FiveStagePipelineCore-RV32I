package FiveStagePipelineCore
import chisel3._
import chisel3.util._

class ID_EX extends Module{
    val io = IO(new Bundle{
		//Inputs
        val IF_ID_pc_in = Input(SInt(32.W))
        val rs1_sel_in = Input(UInt(5.W))
        val rs2_sel_in = Input(UInt(5.W))
        val rd_sel_in = Input(UInt(5.W))
		val aluContrl_in = Input(UInt(5.W))
        val rs1_in = Input(SInt(32.W))
        val rs2_in = Input(SInt(32.W))
		val Bus_A_in = Input(SInt(32.W))
		val Bus_B_in = Input(SInt(32.W))
        val store_in = Input(UInt(1.W))
        val load_in = Input(UInt(1.W))
        val branch_in = Input(UInt(1.W))
        val RegWr_in = Input(UInt(1.W))
		val jal_in = Input(UInt(1.W))
		val  jalr_in = Input(UInt(1.W))

        //Outputs
		val IF_ID_pc_out = Output(SInt(32.W))
        val rs1_sel_out = Output(UInt(5.W))
        val rs2_sel_out = Output(UInt(5.W))
        val rd_sel_out = Output(UInt(5.W))
		val aluContrl_out = Output(UInt(5.W))
        val rs1_out = Output(SInt(32.W))
        val rs2_out = Output(SInt(32.W))
		val Bus_A_out = Output(SInt(32.W))
		val Bus_B_out = Output(SInt(32.W))
        val store_out = Output(UInt(1.W))
        val load_out = Output(UInt(1.W))
        val branch_out = Output(UInt(1.W))
        val RegWr_out = Output(UInt(1.W))
		val jal_out = Output(UInt(1.W))
		val  jalr_out = Output(UInt(1.W))
	)}
		//RegInit
		val IF_ID_pc_reg = RegInit(SInt(32.W))
        val rs1_sel_reg = RegInit(UInt(5.W))
        val rs2_sel_reg = RegInit(UInt(5.W))
        val rd_sel_reg = RegInit(UInt(5.W))
		val aluContrl_reg = RegInit(UInt(5.W))
        val rs1_reg = RegInit(SInt(32.W))
        val rs2_reg = RegInit(SInt(32.W))
		val Bus_A_reg = RegInit(SInt(32.W))
		val Bus_B_reg = RegInit(SInt(32.W))
        val store_reg = RegInit(UInt(1.W))
        val load_reg = RegInit(UInt(1.W))
        val branch_reg = RegInit(UInt(1.W))
        val RegWr_reg = RegInit(UInt(1.W))
		val jal_reg = RegInit(UInt(1.W))
		val jalr_reg = RegInit(UInt(1.W))

		IF_ID_pc_reg := io.IF_ID_pc_in
		io.IF_ID_pc_out := IF_ID_pc_reg
		
		rs1_sel_reg := rs1_in
		rs1_out := rs1_sel_reg

		rs2_sel_reg := rs2_in
		rs2_out := rs2_sel_reg

		rd_sel_reg := rd_sel_in
		rd_sel_out := rd_sel_reg

		aluContrl_reg := aluContrl_in
		aluContrl_out := aluContrl_reg

		rs1_reg := rs2_in
		rs1_out := rs1_reg

		rs2_reg := rs2_in
		rs2_out := rs2_reg

		Bus_A_reg := Bus_A_in
		Bus_A_out := Bus_A_reg

		Bus_B_reg := Bus_B_in
		Bus_A_out := Bus_A_reg

		store_reg := store_in
		store_out := store_reg

		load_reg := load_in
		load_out := load_reg

		branch_reg := branch_in
		branch_out := branch_reg

		RegWr_reg := RegWr_in
		RegWr_out := RegWr_reg

		jal_reg := jal_in
		jal_out := jal_reg

		jalr_reg := jal_in
		jalr_out := jalr_reg

	
}