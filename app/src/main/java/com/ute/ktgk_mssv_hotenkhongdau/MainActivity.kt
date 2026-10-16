
package com.ute.ktgk_mssv_hotenkhongdau

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var edtTen_123: EditText
    private lateinit var edtTien_123: EditText
    private lateinit var edtGhiChu_123: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title =
            "Nguyen Van A - 21110123 - Quản lý chi tiêu cá nhân"

        edtTen_123 = findViewById(R.id.edtTenKhoanChi_123)
        edtTien_123 = findViewById(R.id.edtSoTien_123)
        edtGhiChu_123 = findViewById(R.id.edtGhiChu_123)

        val btnThem_123 = findViewById<Button>(R.id.btnThem_123)
        val btnChiTiet_123 = findViewById<Button>(R.id.btnChiTiet_123)

        btnThem_123.setOnClickListener {
            val ten_123 = edtTen_123.text.toString().trim()
            val tien_123 = edtTien_123.text.toString().toLongOrNull()

            if (ten_123.isEmpty()) {
                edtTen_123.error = "Không được để trống tên"
            } else if (tien_123 == null || tien_123 <= 0) {
                edtTien_123.error = "Số tiền không hợp lệ"
            } else {
                Toast.makeText(
                    this,
                    "Thêm khoản chi thành công",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        btnChiTiet_123.setOnClickListener {
            Toast.makeText(
                this,
                "Chức năng chi tiết sẽ hoàn thiện ở Câu 2",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
